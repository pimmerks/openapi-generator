package org.openapitools.codegen.templating.mustache;

import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Template;

import java.io.IOException;
import java.io.Writer;

/**
 * Removes all line breaks from a text fragment.
 * <p>
 * Register:
 * <pre>
 * additionalProperties.put("removeLineBreaks", new RemoveLineBreaks());
 * </pre>
 * <p>
 * Use:
 * <pre>
 * {{#removeLineBreaks}}
 * multi-
 * line summary
 * {{/removeLineBreaks}}
 * </pre>
 * <p>
 * Out:
 * <pre>
 * multi-line summary
 * </pre>
 */
public class RemoveLineBreaks implements Mustache.Lambda {
    private static final String NEWLINE_REGEX = "\\R+";

    @Override
    public void execute(Template.Fragment fragment, Writer writer) throws IOException {
        writer.write(fragment.execute().replaceAll(NEWLINE_REGEX, ""));
    }
}
