// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the util/function/BooleanNegatedFunction.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.util.function;

import java.util.Objects;


/**
 * Implements the negation of the result of a boolean function.
 *
 * This class is {@link java.io.Serializable} to allow its subclass (also named Serializable) to be serialized, but
 * should not be regarded as "safely serializable" since the function it wraps is not itself guaranteed to be
 * serializable.
 */
class BooleanNegatedFunction1<A> implements BooleanFunction1<A>, java.io.Serializable {
  private static final int CLASS_HASH = BooleanNegatedFunction1.class.hashCode();

  private final BooleanFunction1<A> _function;

  // no-arg constructor for Kryo
  private BooleanNegatedFunction1() {
    _function = null;
  }

  /**
   * Creates a new instance that will negate the result provided by the given, wrapped function.
   *
   * @param function the function to be wrapped
   */
  private BooleanNegatedFunction1(BooleanFunction1<A> function) {
    _function = Objects.requireNonNull(function);
  }

  /**
   * Returns a function that will have a result that is a negation of the function provided.  If the passed function
   * is itself of this type, its underlying (wrapped) function will be returned; otherwise, a new instance of this class
   * will be created to wrap the passed function.
   *
   * @param function the function whose result will be negated
   * @return a function (which may or may not be new) that negates the return value of the provided function
   */
  static <A> BooleanFunction1<A> negate(BooleanFunction1<A> function) {
    if (function instanceof BooleanNegatedFunction1) {
      return ((BooleanNegatedFunction1<A>) function)._function; // negation of a negation is the original function
    }
    return new BooleanNegatedFunction1<>(function);
  }

  @Override
  public boolean apply(A value1) {
    return !_function.apply(value1);
  }

  @Override
  public int hashCode() {
    return CLASS_HASH + _function.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof BooleanNegatedFunction1) {
      return this._function.equals(((BooleanNegatedFunction1) obj)._function);
    }
    return false;
  }

  static class Serializable<A> extends BooleanNegatedFunction1<A> implements BooleanFunction1.Serializable<A> {
    private static final long serialVersionUID = 1;

    // no-arg constructor for Kryo
    private Serializable() {
    }

    /**
     * Creates a new instance that will negate the result provided by the given, wrapped function.
     *
     * @param function the function to be wrapped
     */
    private Serializable(BooleanFunction1.Serializable<A> function) {
      super(function);
    }

    /**
     * Returns a function that will have a result that is a negation of the function provided.  If the passed function
     * is itself of this type, its underlying (wrapped) function will be returned; otherwise, a new instance of this class
     * will be created to wrap the passed function.
     *
     * @param function the function whose result will be negated
     * @return a function (which may or may not be new) that negates the return value of the provided function
     */
    static <A> BooleanFunction1.Serializable<A> negate(BooleanFunction1.Serializable<A> function) {
      if (function instanceof BooleanNegatedFunction1.Serializable) {
        // negation of a negation is the original function
        return (BooleanFunction1.Serializable<A>) ((BooleanNegatedFunction1<A>) function)._function;
      }
      return new BooleanNegatedFunction1.Serializable<>(function);
    }
  }
}