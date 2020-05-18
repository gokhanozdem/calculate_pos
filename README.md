# calculate_pos
This simple service is for my own development. I used Java, Docker, Maven, Spring boot and Kubernetes in this service.
This restful service supply to calculate remain and change amount.
This service can be called like this : http://157.230.194.98:8085/calculate/string?totalAmount=38.44&tenderedAmount=0.40 

Response will be like this : 

{
    "input": {
        "totalAmount": "38.44",
        "tenderedAmount": "0.40"
    },
    "output": {
        "dueAmount": "38.04",
        "changeDueAmount": "0.0",
        "paidAmount": "0.4"
    }
}
