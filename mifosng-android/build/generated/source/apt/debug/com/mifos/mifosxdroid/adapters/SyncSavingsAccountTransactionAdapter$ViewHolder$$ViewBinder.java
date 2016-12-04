// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.adapters;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SyncSavingsAccountTransactionAdapter$ViewHolder$$ViewBinder<T extends SyncSavingsAccountTransactionAdapter.ViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558937, "field 'tv_savings_account_id'");
    target.tv_savings_account_id = finder.castView(view, 2131558937, "field 'tv_savings_account_id'");
    view = finder.findRequiredView(source, 2131558930, "field 'tv_payment_type'");
    target.tv_payment_type = finder.castView(view, 2131558930, "field 'tv_payment_type'");
    view = finder.findRequiredView(source, 2131558940, "field 'tv_transaction_type'");
    target.tv_transaction_type = finder.castView(view, 2131558940, "field 'tv_transaction_type'");
    view = finder.findRequiredView(source, 2131558932, "field 'tv_transaction_amount'");
    target.tv_transaction_amount = finder.castView(view, 2131558932, "field 'tv_transaction_amount'");
    view = finder.findRequiredView(source, 2131558934, "field 'tv_transaction_date'");
    target.tv_transaction_date = finder.castView(view, 2131558934, "field 'tv_transaction_date'");
    view = finder.findRequiredView(source, 2131558917, "field 'tv_error_message'");
    target.tv_error_message = finder.castView(view, 2131558917, "field 'tv_error_message'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SyncSavingsAccountTransactionAdapter.ViewHolder> implements Unbinder {
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
      target.tv_savings_account_id = null;
      target.tv_payment_type = null;
      target.tv_transaction_type = null;
      target.tv_transaction_amount = null;
      target.tv_transaction_date = null;
      target.tv_error_message = null;
    }
  }
}
