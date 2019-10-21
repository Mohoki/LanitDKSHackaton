FROM ru.lanit.dks.hackaton.light/glassfish-2-libs:latest

ENV GLASSFISH_HOME=/opt/glassfish5 \
    PATH=$PATH:/$GLASSFISH_HOME/bin \
    GLASSFISH_ASADMIN="/glassfish4/bin/asadmin"

COPY logback.xml $GLASSFISH_HOME/glassfish/domains/domain1/config

RUN echo "AS_ADMIN_PASSWORD=@glassfish.admin.password@" > /tmp/glassfishpwd && \
    asadmin start-domain domain1 && \
    asadmin --user=admin --passwordfile=/tmp/glassfishpwd change-admin-password --domain_name domain1 && \
    asadmin --user=admin --passwordfile=/tmp/glassfishpwd create-jvm-options -Dlogback.configurationFile=\${com.sun.aas.instanceRoot}/config/logback.xml && \
    asadmin stop-domain domain1 && \
