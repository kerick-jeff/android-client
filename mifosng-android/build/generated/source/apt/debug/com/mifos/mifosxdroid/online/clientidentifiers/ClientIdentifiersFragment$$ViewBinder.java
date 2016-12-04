// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.clientidentifiers;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ClientIdentifiersFragment$$ViewBinder<T extends ClientIdentifiersFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558713, "field 'rv_client_identifier'");
    target.rv_client_identifier = finder.castView(view, 2131558713, "field 'rv_client_identifier'");
    view = finder.findRequiredView(source, 2131558678, "field 'swipeRefreshLayout'");
    target.swipeRefreshLayout = finder.castView(view, 2131558678, "field 'swipeRefreshLayout'");
    view = finder.findRequiredView(source, 2131558715, "field 'mNoIdentifierText'");
    target.mNoIdentifierText = finder.castView(view, 2131558715, "field 'mNoIdentifierText'");
    view = finder.findRequiredView(source, 2131558681, "field 'll_error'");
    target.ll_error = finder.castView(view, 2131558681, "field 'll_error'");
    view = finder.findRequiredView(source, 2131558714, "field 'mNoIdentifierIcon'");
    target.mNoIdentifierIcon = finder.castView(view, 2131558714, "field 'mNoIdentifierIcon'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ClientIdentifiersFragment> implements Unbinder {
    private T target;

    protected InnerUnbinder(T target) {
      this.target = target;
    }

    @Override
    public final void unbind() {
      if (target == null) throw new IllegalStateException("Bindings already cleared.");
      unbind(target);
      target = null;
    }

    protected void unbind(T target) {
      target.rv_client_identifier = null;
      target.swipeRefreshLayout = null;
      target.mNoIdentifierText = null;
      target.ll_error = null;
      target.mNoIdentifierIcon = null;
    }
  }
}
