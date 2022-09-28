package com.mycompany.angularsandbox;

import com.mycompany.angularsandbox.AngularSandboxApplicationApp;
import com.mycompany.angularsandbox.config.AsyncSyncConfiguration;
import com.mycompany.angularsandbox.config.EmbeddedElasticsearch;
import com.mycompany.angularsandbox.config.EmbeddedKafka;
import com.mycompany.angularsandbox.config.EmbeddedSQL;
import com.mycompany.angularsandbox.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { AngularSandboxApplicationApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
