package com.relation.demoonetomany;

import com.relation.model.*;
import com.relation.pojo.ProposalPojo;
import com.relation.pojo.ProposalPojoImpl;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author rahul
 */
public class TestClass {

    public static Logger logger = Logger.getLogger(TestClass.class.getName());

    public static void main(String[] args) {

        ProposalPojo repository = new ProposalPojoImpl();
//        byte[] b = "rahul".getBytes();
//        List<Personnel> plist = new ArrayList<>();
//        plist.add(new Personnel("Chintan", QualificationLevel.Pro, "9656231296"));
//
//        List<Attachment> alist = new ArrayList<>();
//        alist.add(new Attachment("new file", "1232", LocalDateTime.MAX, b));
//
//        Proposal proposal = new Proposal("My praposal attachment", "new comment for this", plist, alist);
//        repository.addPraposal(proposal);
//        logger.info("+++++" + proposal);

        logger.info("+++++" + repository.getProposal(Long.valueOf(1)));

//        repository.removePraposal(Long.valueOf(2));
        
//        Proposal p = repository.getProposal(Long.valueOf(1));
//        p.setComment("Nothig to comment");
//        repository.updatePraposal(Long.valueOf(1), p);

//        logger.info("+++++" + repository.getProposals());

    }
}
