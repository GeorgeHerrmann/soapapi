# soapapi

A basic REST API that reads data from SOAP Bot (https://github.com/GeorgeHerrmann/soapbot)
To access the API you can do the following:
  - In a web browser you can go to http://api.georgster.com
  - Anywhere else must directly access the API at http://georgster.com:8080

Current valid SOAP API requests:
  - GET from /action (returns a JSON with SOAP Bot's most recent action)

Example API request:
  - http://georgster.com:8080/action
