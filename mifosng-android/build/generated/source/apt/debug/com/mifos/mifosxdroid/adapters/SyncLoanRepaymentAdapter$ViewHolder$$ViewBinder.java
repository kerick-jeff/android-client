// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.adapters;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SyncLoanRepaymentAdapter$ViewHolder$$ViewBinder<T extends SyncLoanRepaymentAdapter.ViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558926, "field 'tv_loan_id'");
    target.tv_loan_id = finder.castView(view, 2131558926, "field 'tv_loan_id'");
    view = finder.findRequiredView(source, 2131558928, "field 'tv_account_number'");
    target.tv_account_number = finder.castView(view, 2131558928, "field 'tv_account_number'");
    view = finder.findRequiredView(source, 2131558930, "field 'tv_payment_type'");
    target.tv_payment_type = finder.castView(view, 2131558930, "field 'tv_payment_type'");
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

  protected static class InnerUnbinder<T extends SyncLoanRepaymentAdapter.ViewHolder> implements Unbinder {
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
      target.tv_loan_id = null;
      target.tv_account_number = null;
      target.tv_payment_type = null;
      target.tv_transaction_amount = null;
      target.tv_transaction_date = null;
      target.tv_error_message = null;
    }
  }
}
