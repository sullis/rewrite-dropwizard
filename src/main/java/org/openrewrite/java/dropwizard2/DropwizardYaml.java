package org.openrewrite.java.dropwizard2;

import org.openrewrite.Recipe;
import java.util.Set;

public class DropwizardYaml extends Recipe {
    @Override
    public String getDisplayName() {
        return "migrate Dropwizard 2.x yaml";
    }
    @Override
    public Set<String> getTags() {
        return Utils.COMMON_TAGS;
    }
}
