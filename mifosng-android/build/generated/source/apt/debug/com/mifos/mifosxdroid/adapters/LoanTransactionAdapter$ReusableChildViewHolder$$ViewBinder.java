// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.adapters;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class LoanTransactionAdapter$ReusableChildViewHolder$$ViewBinder<T extends LoanTransactionAdapter.ReusableChildViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131559002, "field 'tv_transactionId'");
    target.tv_transactionId = finder.castView(view, 2131559002, "field 'tv_transactionId'");
    view = finder.findRequiredView(source, 2131558959, "field 'tv_officeName'");
    target.tv_officeName = finder.castView(view, 2131558959, "field 'tv_officeName'");
    view = finder.findRequiredView(source, 2131558802, "field 'tv_principal'");
    target.tv_principal = finder.castView(view, 2131558802, "field 'tv_principal'");
    view = finder.findRequiredView(source, 2131558806, "field 'tv_interest'");
    target.tv_interest = finder.castView(view, 2131558806, "field 'tv_interest'");
    view = finder.findRequiredView(source, 2131558810, "field 'tv_fees'");
    target.tv_fees = finder.castView(view, 2131558810, "field 'tv_fees'");
    view = finder.findRequiredView(source, 2131559005, "field 'tv_penalties'");
    target.tv_penalties = finder.castView(view, 2131559005, "field 'tv_penalties'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends LoanTransactionAdapter.ReusableChildViewHolder> implements Unbinder {
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
      target.tv_transactionId = null;
      target.tv_officeName = null;
      target.tv_principal = null;
      target.tv_interest = null;
      target.tv_fees = null;
      target.tv_penalties = null;
    }
  }
}
