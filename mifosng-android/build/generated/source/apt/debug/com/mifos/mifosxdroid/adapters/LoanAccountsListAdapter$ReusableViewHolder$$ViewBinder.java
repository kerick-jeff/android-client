// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.adapters;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class LoanAccountsListAdapter$ReusableViewHolder$$ViewBinder<T extends LoanAccountsListAdapter.ReusableViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558953, "field 'tv_amount'");
    target.tv_amount = finder.castView(view, 2131558953, "field 'tv_amount'");
    view = finder.findRequiredView(source, 2131558697, "field 'tv_accountNumber'");
    target.tv_accountNumber = finder.castView(view, 2131558697, "field 'tv_accountNumber'");
    view = finder.findRequiredView(source, 2131558788, "field 'view_status_indicator'");
    target.view_status_indicator = view;
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends LoanAccountsListAdapter.ReusableViewHolder> implements Unbinder {
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
      target.tv_amount = null;
      target.tv_accountNumber = null;
      target.view_status_indicator = null;
    }
  }
}
