# springboot-http-ssl

HTTPS is a secure version of HTTP designed to provide Transport Layer Security (TLS).

We can implement HTTPS by installing the SSL certificates on our web application. We can use either certificate issued by trusted Certificate Authorities (CA) or Self-Signed Certificate.

For Learning purpose, We can use the Self-Signed Certificate. We can generate the Self Signed Certificate by using the Java Keytool.

1. JKS(Java Key Store) is easy to access from our own Java apps. JKS is limited only to Java and not accessible from outside Java.
2. PKCS12: Public Key Cryptographic Standards, on the other hand, are a language-neutral way to store encrypted private keys and certificates

Open Command Prompt as Administrator

Goto : C:\Program Files\Java\jdk1.8.0_161\bin>

keytool -genkeypair -alias selfsigned_localhost_sslserver -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore test-ssl-key.p12 -validity 3650


Now Copy this file "test-ssl-key.p12" into src/main/resources folder.


#Make Application to support both HTTP (8081) and HTTPS (8082)
#http.port=8081
#server.port=8082
#server.ssl.key-password=****jkspassword***
#server.ssl.key-store=classpath:applicationssl.jks
#server.ssl.key-store-type=JKS