package net.karneim.pojobuilder.processor.with.builderdependencies;

import net.karneim.pojobuilder.processor.AnnotationProcessor;
import net.karneim.pojobuilder.processor.with.ProcessorTestSupport;
import org.junit.Test;

import static net.karneim.pojobuilder.PbAssertions.assertThat;

/**
 * @feature The {@link AnnotationProcessor} generates builder classes.
 */
public class AnnotationProcessor_BuilderDependencies_Test extends ProcessorTestSupport {

  /**
   * @throws Exception
   * @scenario A pojo has a dependency on a not-yet-generated builder.
   */
  @Test
  public void testShouldGenerateBuilderForPojoWithBuilderDependencies() throws Exception {
    // Given:
    sourceFor(PojoE.class);
    sourceFor("net.karneim.pojobuilder.processor.with.builderdependencies.PojoF");
    sourceFor("net.karneim.pojobuilder.processor.with.builderdependencies.PojoFFactory");
    // When:
    boolean success = prj.compile();
    // Then:
    assertThat(prj)
        .generatedSameSourceAs("net.karneim.pojobuilder.processor.with.builderdependencies.PojoFBuilder")
        .compiled("net.karneim.pojobuilder.processor.with.builderdependencies.PojoF")
        .compiled("net.karneim.pojobuilder.processor.with.builderdependencies.PojoFFactory")
        .compiled("net.karneim.pojobuilder.processor.with.builderdependencies.PojoFBuilder");
    assertThat(success).isTrue();
  }
}
