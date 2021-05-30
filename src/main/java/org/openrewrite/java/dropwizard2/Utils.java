package org.openrewrite.java.dropwizard2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Utils {
    public static final Set<String> COMMON_TAGS;

    static {
        Set<String> tags = new HashSet<String>();
        tags.add("dropwizard");
        COMMON_TAGS = Collections.unmodifiableSet(tags);
    }
}
