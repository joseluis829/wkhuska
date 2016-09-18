/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.ak;

import org.apache.marmotta.ldclient.api.ldclient.LDClientService;
import org.apache.marmotta.ldclient.exception.DataRetrievalException;
import org.apache.marmotta.ldclient.model.ClientConfiguration;
import org.apache.marmotta.ldclient.model.ClientResponse;
import org.apache.marmotta.ldclient.services.ldclient.LDClient;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openrdf.repository.RepositoryException;
import org.openrdf.rio.RDFHandler;
import org.openrdf.rio.RDFHandlerException;
import org.openrdf.rio.rdfxml.util.RDFXMLPrettyWriter;

/**
 *
 * @author Freddy Sumba
 */
public class TestAK {

    public TestAK() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
   
    public void testMicrosoftAcademics() {
        ClientConfiguration config = new ClientConfiguration();

        LDClientService ldclient = new LDClient(config);
        try {
            ClientResponse res;
            res = ldclient.retrieveResource("https://api.projectoxford.ai/academic/v1.0/evaluate?expr=Composite(AA.AuN==%27Brajesh%20Kumar%27)&attributes=Id,Ti,Y,D,CC,ECC,AA.AuN,AA.AuId,AA.AfN,AA.AfId,F.FN,F.FId,J.JN,J.JId,C.CN,C.CId,RId,W,E,D&E=DN,D,S,S.Ty,S.U,VFN,VSN,V,I,FP,LP,DOI&subscription-key=f66e8b1a39634d9591151a8efd80cfc2&count=100");
            RDFHandler handler = new RDFXMLPrettyWriter(System.out);
            
            try {
                res.getTriples().getConnection().export(handler);
            } catch (RepositoryException e) {
                //e.printStackTrace();
            } catch (RDFHandlerException e) {
                //e.printStackTrace();
            }
        } catch (DataRetrievalException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
        }
    }
}
