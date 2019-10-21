FROM ru.lanit.dks.hackaton.light/glassfish-1-base:latest

ENV GLASSFISH_HOME=/opt/glassfish5 \
    PATH=$PATH:/$GLASSFISH_HOME/bin \
    GLASSFISH_ASADMIN="/glassfish4/bin/asadmin"

RUN curl https://jdbc.postgresql.org/download/postgresql-9.4.1212.jar -o $GLASSFISH_HOME/glassfish/domains/domain1/lib/postgresql-9.4.1212.jar
