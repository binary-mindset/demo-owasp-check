# OWASP Dependency Check

This project is a quick demonstration of how to use the OWASP Dependency Check plugin.

### Configure the plugin

Import the dependency in your project and configure it as you want. In this case, we want the pipelines to fail if any vulnerability with a score CVSS >= 7.
```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.owasp</groupId>
            <artifactId>dependency-check-maven</artifactId>
            <version>6.5.0</version>
            <configuration>
                <failBuildOnCVSS>7</failBuildOnCVSS>
                <suppressionFiles>
                    <suppressionFile>owasp-dependency-check-suppressions.xml</suppressionFile>
                </suppressionFiles>
            </configuration>
        </plugin>
    </plugins>
</build>
```

### How to execute

If you want to start the depenency check, just launch the following command:
```shell
mvn dependency-check:check
```

Once it finishes, the report with the results will be generated inside the target folder.