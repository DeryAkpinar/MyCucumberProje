package pojos;

public class US007Pojo {
    /*
    {

    "createdBy": "cizmelikedi",
    "createdDate": "2022-11-24T16:38:15.297613Z",
    "id": 333185,
    "startDate": "2022-11-24T00:00:00Z",
    "endDate": "2022-11-24T01:00:00Z",
    "status": "PENDING",
    "anamnesis": "deneme",
    "treatment": "deneme1",
    "diagnosis": "deneme3",
    "prescription": "",
    "description": "denemeler",
    "physician": {
        "createdBy": "team55",
        "createdDate": "2022-08-05T13:19:57.964107Z",
        "id": 159228,
        "firstName": "Doktor",
        "lastName": "Hatice",
        "birthDate": "2002-08-04T21:00:00Z",
        "phone": "646-646-6464",
        "gender": "FEMALE",
        "bloodGroup": "Apositive",
        "adress": "",
        "description": "",
        "user": {
            "createdBy": "anonymousUser",
            "createdDate": "2022-08-05T13:17:02.087904Z",
            "id": 159422,
            "login": "doktorhatice",
            "firstName": "Doktor",
            "lastName": "Hatice",
            "email": "doktorhatice06@gmail.com",
            "activated": true,
            "langKey": "en",
            "imageUrl": null,
            "resetDate": null,
            "ssn": "646-06-6401"
        },
        "speciality": "ALLERGY_IMMUNOLOGY",
        "country": null,
        "cstate": null,
        "examFee": 350.00,
        "image": "",
        "imageContentType": null
    },
    "patient": {
        "createdBy": "cizmelikedi",
        "createdDate": "2022-11-16T16:24:44.666474Z",
        "id": 303599,
        "firstName": "HastaKedi",
        "lastName": "Hasta",
        "birthDate": null,
        "phone": "5551235555",
        "gender": null,
        "bloodGroup": null,
        "adress": null,
        "email": "kedi@gmail.com",
        "description": null,
        "user": {
            "createdBy": "anonymousUser",
            "createdDate": "2022-11-15T18:03:04.522385Z",
            "id": 301149,
            "login": "cizmelikedi",
            "firstName": "Luigi",
            "lastName": "Doyle",
            "email": "anne.franecki@gmail.com",
            "activated": true,
            "langKey": "en",
            "imageUrl": null,
            "resetDate": null,
            "ssn": "102-22-1023"
        },
        "inPatients": null,
        "country": null,
        "cstate": null
    },
    "ctests": null
}
     */


    private String createdBy;
    private String createdDate ;
    private String startDate;
    private String endDate;


    public US007Pojo(String createdBy, String createdDate, String startDate, String endDate) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public US007Pojo() {
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


    @Override
    public String toString() {
        return "US007Pojo{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
