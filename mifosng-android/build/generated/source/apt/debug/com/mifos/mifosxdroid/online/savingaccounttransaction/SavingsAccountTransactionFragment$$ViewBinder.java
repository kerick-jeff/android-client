// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.savingaccounttransaction;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SavingsAccountTransactionFragment$$ViewBinder<T extends SavingsAccountTransactionFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558571, "field 'viewFlipper'");
    target.viewFlipper = finder.castView(view, 2131558571, "field 'viewFlipper'");
    view = finder.findRequiredView(source, 2131558784, "field 'tv_clientName'");
    target.tv_clientName = finder.castView(view, 2131558784, "field 'tv_clientName'");
    view = finder.findRequiredView(source, 2131558848, "field 'tv_accountNumber'");
    target.tv_accountNumber = finder.castView(view, 2131558848, "field 'tv_accountNumber'");
    view = finder.findRequiredView(source, 2131558868, "field 'tv_transactionDate'");
    target.tv_transactionDate = finder.castView(view, 2131558868, "field 'tv_transactionDate'");
    view = finder.findRequiredView(source, 2131558871, "field 'et_transactionAmount'");
    target.et_transactionAmount = finder.castView(view, 2131558871, "field 'et_transactionAmount'");
    view = finder.findRequiredView(source, 2131558827, "field 'sp_paymentType'");
    target.sp_paymentType = finder.castView(view, 2131558827, "field 'sp_paymentType'");
    view = finder.findRequiredView(source, 2131558874, "method 'onReviewTransactionButtonClicked'");
    unbinder.view2131558874 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onReviewTransactionButtonClicked();
      }
    });
    view = finder.findRequiredView(source, 2131558873, "method 'onCancelTransactionButtonClicked'");
    unbinder.view2131558873 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCancelTransactionButtonClicked();
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SavingsAccountTransactionFragment> implements Unbinder {
    private T target;

    View view2131558874;

    View view2131558873;

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
      target.viewFlipper = null;
      target.tv_clientName = null;
      target.tv_accountNumber = null;
      target.tv_transactionDate = null;
      target.et_transactionAmount = null;
      target.sp_paymentType = null;
      view2131558874.setOnClickListener(null);
      view2131558873.setOnClickListener(null);
    }
  }
}
