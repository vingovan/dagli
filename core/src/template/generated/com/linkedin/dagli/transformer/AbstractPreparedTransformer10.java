// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the transformer/AbstractPreparedTransformerX.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.transformer;

import com.linkedin.dagli.producer.Producer;
import com.linkedin.dagli.transformer.internal.PreparedTransformer10InternalAPI;


/**
 * Base class for prepared transformers of arity 10 that do not cache temporary data during execution and do not
 * minibatch their inputs (transformers that do so should instead derive from
 * {@link AbstractPreparedStatefulTransformer10}.)
 *
 * @param <A> the type of the first input to the transformer
 * @param <B> the type of the second input to the transformer
 * @param <C> the type of the third input to the transformer
 * @param <D> the type of the fourth input to the transformer
 * @param <E> the type of the fifth input to the transformer
 * @param <F> the type of the sixth input to the transformer
 * @param <G> the type of the seventh input to the transformer
 * @param <H> the type of the eighth input to the transformer
 * @param <I> the type of the ninth input to the transformer
 * @param <J> the type of the tenth input to the transformer
 * @param <R> the type of result produced by the transformer
 * @param <S> the ultimate derived class
 */
public abstract class AbstractPreparedTransformer10<A, B, C, D, E, F, G, H, I, J, R, S extends AbstractPreparedTransformer10<A, B, C, D, E, F, G, H, I, J, R, S>>
    extends
    AbstractTransformer10<A, B, C, D, E, F, G, H, I, J, R, PreparedTransformer10InternalAPI<A, B, C, D, E, F, G, H, I, J, R, S>, S>
    implements PreparedTransformer10<A, B, C, D, E, F, G, H, I, J, R> {

  private static final long serialVersionUID = 1;

  public AbstractPreparedTransformer10() {
    super();
  }

  @Override
  public PreparedTransformer10InternalAPI<A, B, C, D, E, F, G, H, I, J, R, S> internalAPI() {
    return (PreparedTransformer10InternalAPI<A, B, C, D, E, F, G, H, I, J, R, S>) super.internalAPI();
  }

  @Override
  protected PreparedTransformer10InternalAPI<A, B, C, D, E, F, G, H, I, J, R, S> createInternalAPI() {
    return new InternalAPI();
  }

  protected class InternalAPI
      extends
      AbstractTransformer10<A, B, C, D, E, F, G, H, I, J, R, PreparedTransformer10InternalAPI<A, B, C, D, E, F, G, H, I, J, R, S>, S>.InternalAPI
      implements PreparedTransformer10InternalAPI<A, B, C, D, E, F, G, H, I, J, R, S> {
    @Override
    public R apply(Object executionCache, A value1, B value2, C value3, D value4, E value5, F value6, G value7,
        H value8, I value9, J value10) {
      return AbstractPreparedTransformer10.this.apply(value1, value2, value3, value4, value5, value6, value7, value8,
          value9, value10);
    }
  }

  public AbstractPreparedTransformer10(Producer<? extends A> input1, Producer<? extends B> input2,
      Producer<? extends C> input3, Producer<? extends D> input4, Producer<? extends E> input5,
      Producer<? extends F> input6, Producer<? extends G> input7, Producer<? extends H> input8,
      Producer<? extends I> input9, Producer<? extends J> input10) {
    super(input1, input2, input3, input4, input5, input6, input7, input8, input9, input10);
  }
}