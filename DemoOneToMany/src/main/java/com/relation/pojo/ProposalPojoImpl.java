package com.relation.pojo;

import com.relation.model.Proposal;
import com.relation.util.EntityManagerUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author rahul
 */
public class ProposalPojoImpl implements ProposalPojo {

    private EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void addPraposal(Proposal proposal) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(proposal);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction() != null) {
                entityManager.getTransaction().rollback();
            }
        }
    }

    @Override
    public List<Proposal> getProposals() {
        List<Proposal> list = new ArrayList<>();
        try {
            list = entityManager.createQuery("from Proposal").getResultList();
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Proposal getProposal(Long id) {
        Proposal proposal = null;
        try {
            proposal = entityManager.find(Proposal.class, id);
        } catch (Exception e) {
        }
        return proposal;
    }

    @Override
    public void removePraposal(Long id) {
        try {
            entityManager.getTransaction().begin();
            Proposal old = entityManager.find(Proposal.class, id);
            entityManager.remove(old);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction() != null) {
                entityManager.getTransaction().rollback();
            }
        }
    }

    @Override
    public void updatePraposal(Long id, Proposal proposal) {

        try {
            entityManager.getTransaction().begin();
            Proposal old = entityManager.find(Proposal.class, id);
            old.setComment(proposal.getComment());
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction() != null) {
                entityManager.getTransaction().rollback();
            }
        }
    }

}
