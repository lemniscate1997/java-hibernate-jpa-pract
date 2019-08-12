package com.relation.pojo;

import com.relation.model.Proposal;
import java.util.List;

/**
 *
 * @author rahul
 */
public interface ProposalPojo {
    public void addPraposal(Proposal proposal);
    public List<Proposal> getProposals();
    public Proposal getProposal(Long id);
    public void updatePraposal(Long id, Proposal proposal);
    public void removePraposal(Long id);
}
