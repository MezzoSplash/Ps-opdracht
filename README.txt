In deze git staat de triviale informatie en dingen die ik heb gebruikt


PI:
Tomcat9.0.12
OPENJDK9
Compiled in IntelliJ JDK 9
RaspAP wifi portal




iptables:


iptables -L -v -n


//whitelist mezelf.
iptables -I INPUT -s 145.28.231.104 -j ACCEPT


//drop facebook
iptables -A OUTPUT -p tcp -i eth0 –o eth1 –d 31.13.64.0/18 -j DROP

//prevent dos
iptables -A INPUT -p tcp --dport 80 -m limit --limit 25/minute --limit-burst 100 -j ACCEPT
