// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the util/function/DefaultOnNullArgument.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.util.function;

import com.linkedin.dagli.util.named.Named;
import java.util.Objects;


/**
 * A function class implementing Function6.Serializable<A, B, C, D, E, F, R> that returns null if any of
 * the function's inputs are null.
 */
class DefaultOnNullArgument6<A, B, C, D, E, F, R> implements Function6.Serializable<A, B, C, D, E, F, R>, Named {
  private static final long serialVersionUID = 1;
  private static final int CLASS_HASH = DefaultOnNullArgument6.class.hashCode();
  private final Function6<A, B, C, D, E, F, R> _wrapped;

  DefaultOnNullArgument6(Function6<A, B, C, D, E, F, R> wrapped) {
    // stacking this wrapper multiple times should be idempotent:
    if (wrapped instanceof DefaultOnNullArgument6) {
      _wrapped = ((DefaultOnNullArgument6) wrapped)._wrapped;
    } else {
      _wrapped = Objects.requireNonNull(wrapped);
    }
  }

  @Override
  public DefaultOnNullArgument6<A, B, C, D, E, F, R> safelySerializable() {
    return new DefaultOnNullArgument6<>(((Function6.Serializable<A, B, C, D, E, F, R>) _wrapped).safelySerializable());
  }

  @Override
  public R apply(A value1, B value2, C value3, D value4, E value5, F value6) {
    if (value1 == null || value2 == null || value3 == null || value4 == null || value5 == null || value6 == null) {
      return null;
    }
    return _wrapped.apply(value1, value2, value3, value4, value5, value6);
  }

  @Override
  public int hashCode() {
    return CLASS_HASH + _wrapped.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof DefaultOnNullArgument6) {
      return this._wrapped.equals(((DefaultOnNullArgument6) obj)._wrapped);
    }
    return false;
  }

  @Override
  public String toString() {
    return "arg == null ? null : " + Named.getName(_wrapped);
  }

  @Override
  public String getShortName() {
    return "arg == null ? null : " + Named.getShortName(_wrapped);
  }
}
