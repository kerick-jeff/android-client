// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.adapters;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SavingsAccountTransactionsListAdapter$ReusableViewHolder$$ViewBinder<T extends SavingsAccountTransactionsListAdapter.ReusableViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558868, "field 'tv_transactionDate'");
    target.tv_transactionDate = finder.castView(view, 2131558868, "field 'tv_transactionDate'");
    view = finder.findRequiredView(source, 2131558939, "field 'tv_transactionType'");
    target.tv_transactionType = finder.castView(view, 2131558939, "field 'tv_transactionType'");
    view = finder.findRequiredView(source, 2131558870, "field 'tv_transactionAmount'");
    target.tv_transactionAmount = finder.castView(view, 2131558870, "field 'tv_transactionAmount'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SavingsAccountTransactionsListAdapter.ReusableViewHolder> implements Unbinder {
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
      target.tv_transactionDate = null;
      target.tv_transactionType = null;
      target.tv_transactionAmount = null;
    }
  }
}
