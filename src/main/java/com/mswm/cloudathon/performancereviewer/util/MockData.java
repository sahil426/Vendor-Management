package com.mswm.cloudathon.performancereviewer.util;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class MockData {

    private static final String reviewInfoData = "{\"fwdSuccess\":true,\"reviewerSize\":2,\"people\":[{\"contingentsSize\":2,\"reviewerInfo\":{\"isAdmin\":true,\"emailAddress\":\"Sachin.Thakkar@morganstanley.com\",\"photoURL\":\"https://ldapphoto.ms.com/photos/90MPG.jpg\",\"fullName\":\"Sachin Thakkar\",\"userId\":\"thakksac\",\"contingents\":[{\"emailAddress\":\"Mahesh.Peddi@morganstanley.com\",\"fullName\":\"Mahesh Peddi\",\"userId\":\"peddimah\",\"reviewStatus\":\"Pending\",\"reviewedOn\":\"2022-02-22T16:24:20Z\",\"techFamily\":\"Java\",\"vendor\":\"Tech Mahindra\"},{\"emailAddress\":\"Balaji.Sunder@morganstanley.com\",\"fullName\":\"Balaji Sunder\",\"userId\":\"sundebal\",\"reviewStatus\":\"Pending\",\"reviewedOn\":\"2022-02-22T16:24:20Z\",\"techFamily\":\"Java\",\"vendor\":\"Tech Mahindra\"}]}},{\"contingentsSize\":1,\"reviewerInfo\":{\"isAdmin\":true,\"emailAddress\":\"Mohammad.shabirali1@morganstanley.com\",\"photoURL\":\"https://ldapphoto.ms.com/photos/93PLW.jpg\",\"fullName\":\"MOhammad Shabir Ali\",\"userId\":\"almoh\",\"contingents\":[{\"emailAddress\":\"Asif.Basha@morganstanley.com\",\"fullName\":\"Asif Basha\",\"userId\":\"bashaasi\",\"reviewStatus\":\"Pending\",\"reviewedOn\":\"2022-02-22T16:24:20Z\",\"techFamily\":\"QA\",\"vendor\":\"Tech Mahindra\"}]}},{\"contingentsSize\":2,\"reviewerInfo\":{\"isAdmin\":true,\"emailAddress\":\"Bhupendra.singh@morganstanley.com\",\"photoURL\":\"https://ldapphoto.ms.com/photos/90MPG.jpg\",\"fullName\":\"Bhupendra Singh\",\"userId\":\"singhbhup\",\"contingents\":[{\"emailAddress\":\"Devendar.Reddy@morganstanley.com\",\"fullName\":\"Devendar Reddy\",\"userId\":\"devendar\",\"reviewStatus\":\"Pending\",\"reviewedOn\":\"2022-02-22T16:24:20Z\",\"techFamily\":\"UI\",\"vendor\":\"Tech Mahindra\"},{\"emailAddress\":\"Neha.Goswami@morganstanley.com\",\"fullName\":\"Neha Goswami\",\"userId\":\"neha\",\"reviewStatus\":\"Pending\",\"reviewedOn\":\"2022-02-22T16:24:20Z\",\"techFamily\":\"UX\",\"vendor\":\"Genpact\"}]}},{\"contingentsSize\":2,\"reviewerInfo\":{\"isAdmin\":true,\"emailAddress\":\"Sayam.Samanta@morganstanley.com\",\"photoURL\":\"https://ldapphoto.ms.com/photos/90MPG.jpg\",\"fullName\":\"Sachin Samanta\",\"userId\":\"sayams\",\"contingents\":[{\"emailAddress\":\"Jinesh.Shah@morganstanley.com\",\"fullName\":\"Jinesh Shah\",\"userId\":\"shahj\",\"reviewStatus\":\"Pending\",\"reviewedOn\":\"2022-02-22T16:24:20Z\",\"techFamily\":\"Java\",\"vendor\":\"Tech Mahindra\"},{\"emailAddress\":\"Pournima.Shah@morganstanley.com\",\"fullName\":\"Pournima Sunder\",\"userId\":\"pournima\",\"reviewStatus\":\"Pending\",\"reviewedOn\":\"2022-02-22T16:24:20Z\",\"techFamily\":\"QA\",\"vendor\":\"Genpact\"}]}},{\"contingentsSize\":2,\"reviewerInfo\":{\"isAdmin\":true,\"emailAddress\":\"Venkata.Sumanth@morganstanley.com\",\"photoURL\":\"https://ldapphoto.ms.com/photos/90MPG.jpg\",\"fullName\":\"Venkata Sumanth\",\"userId\":\"sumanth\",\"contingents\":[{\"emailAddress\":\"Tiruparti.rao@morganstanley.com\",\"fullName\":\"Tirupati Rao\",\"userId\":\"tiru\",\"reviewStatus\":\"Pending\",\"reviewedOn\":\"2022-02-22T16:24:20Z\",\"techFamily\":\"UX\",\"vendor\":\"Tech Mahindra\"},{\"emailAddress\":\"Siva.Nalla@morganstanley.com\",\"fullName\":\"Siva Nalla\",\"userId\":\"siva\",\"reviewStatus\":\"Pending\",\"reviewedOn\":\"2022-02-22T16:24:20Z\",\"techFamily\":\"Java\",\"vendor\":\"Genpact\"}]}}]}";

    private static final String vendorsData = "{\"vendorsInfo\":[{\"vendor\":\"Tech Mahindra Limited\",\"loginId\":\"peddimah\"},{\"vendor\":\"Tech Mahindra Limited\",\"loginId\":\"sundebal\"},{\"vendor\":\"Tech Mahindra Limited\",\"loginId\":\"tirupatr\"},{\"vendor\":\"Tech Mahindra Limited\",\"loginId\":\"bashaasi\"},{\"vendor\":\"Wissen Technology Pvt Ltd\",\"loginId\":\"jineshbs\"}]}";

    public static JsonNode getReviewInfoData() throws IOException {
        return getJsonNode(reviewInfoData);
    }

    public static JsonNode getJsonNode(String message) throws IOException {
        JsonNode dataJsonNode;

        if(null == message) return null;

        ObjectMapper mapper = new ObjectMapper();
        JsonFactory factory = mapper.getFactory();
        JsonParser jsonParser = factory.createParser(message);
        dataJsonNode = mapper.readTree(jsonParser);

        return dataJsonNode;

    }

    public static String getReviewInfoStrData()  {
        return reviewInfoData;
    }

    public static String getVendorsData()  {
        return vendorsData;
    }
}
