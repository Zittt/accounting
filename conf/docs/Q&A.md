### here are some troubles in this projects

##### about frameworks
1. ${env} value can not be passed in the pom.xml(accounting/pom.xml) and web.xml
> did not set the pom.xml(accounting-web/pom.xml) well. content in <build>... etc.
    i thought that was not necessary at the begining. =.= 
    
2. rabbitmq
> an exchange can  binding several queues, a queue band 1 routingkey
    an amqpTemplate( to send message) banding an exchange and a routingkey, though it could be
    set in the java class.