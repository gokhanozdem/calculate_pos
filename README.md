# calculate_pos
this restful service supply to calculate remain and change amount.

this service can be called like this : http://<URL:PORT>/calculate/string?totalAmount=38.44&tenderedAmount=0.40 

response will be like this : 

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
