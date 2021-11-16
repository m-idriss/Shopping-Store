module shop.api {
    requires java.persistence;
    requires java.validation;
    requires com.fasterxml.jackson.annotation;
    requires jjwt;
    requires org.apache.tomcat.embed.core;
    requires org.hibernate.orm.core;
    requires org.slf4j;
    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.data.commons;
    requires spring.data.jpa;
    requires spring.jcl;
    requires spring.security.config;
    requires spring.security.core;
    requires spring.security.web;
    requires spring.tx;
    requires spring.web;
}