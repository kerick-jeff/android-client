// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.loanrepayment;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class LoanRepaymentFragment$$ViewBinder<T extends LoanRepaymentFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558822, "field 'rl_loan_repayment'");
    target.rl_loan_repayment = finder.castView(view, 2131558822, "field 'rl_loan_repayment'");
    view = finder.findRequiredView(source, 2131558784, "field 'tv_clientName'");
    target.tv_clientName = finder.castView(view, 2131558784, "field 'tv_clientName'");
    view = finder.findRequiredView(source, 2131558789, "field 'tv_loanProductShortName'");
    target.tv_loanProductShortName = finder.castView(view, 2131558789, "field 'tv_loanProductShortName'");
    view = finder.findRequiredView(source, 2131558790, "field 'tv_loanAccountNumber'");
    target.tv_loanAccountNumber = finder.castView(view, 2131558790, "field 'tv_loanAccountNumber'");
    view = finder.findRequiredView(source, 2131558797, "field 'tv_inArrears'");
    target.tv_inArrears = finder.castView(view, 2131558797, "field 'tv_inArrears'");
    view = finder.findRequiredView(source, 2131558824, "field 'tv_amountDue'");
    target.tv_amountDue = finder.castView(view, 2131558824, "field 'tv_amountDue'");
    view = finder.findRequiredView(source, 2131558826, "field 'tv_repaymentDate'");
    target.tv_repaymentDate = finder.castView(view, 2131558826, "field 'tv_repaymentDate'");
    view = finder.findRequiredView(source, 2131558828, "field 'et_amount'");
    target.et_amount = finder.castView(view, 2131558828, "field 'et_amount'");
    view = finder.findRequiredView(source, 2131558829, "field 'et_additionalPayment'");
    target.et_additionalPayment = finder.castView(view, 2131558829, "field 'et_additionalPayment'");
    view = finder.findRequiredView(source, 2131558830, "field 'et_fees'");
    target.et_fees = finder.castView(view, 2131558830, "field 'et_fees'");
    view = finder.findRequiredView(source, 2131558818, "field 'tv_total'");
    target.tv_total = finder.castView(view, 2131558818, "field 'tv_total'");
    view = finder.findRequiredView(source, 2131558827, "field 'sp_paymentType'");
    target.sp_paymentType = finder.castView(view, 2131558827, "field 'sp_paymentType'");
    view = finder.findRequiredView(source, 2131558832, "field 'bt_paynow' and method 'onPayNowButtonClicked'");
    target.bt_paynow = finder.castView(view, 2131558832, "field 'bt_paynow'");
    unbinder.view2131558832 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onPayNowButtonClicked();
      }
    });
    view = finder.findRequiredView(source, 2131558831, "method 'onCancelPaymentButtonClicked'");
    unbinder.view2131558831 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCancelPaymentButtonClicked();
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends LoanRepaymentFragment> implements Unbinder {
    private T target;

    View view2131558832;

    View view2131558831;

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
      target.rl_loan_repayment = null;
      target.tv_clientName = null;
      target.tv_loanProductShortName = null;
      target.tv_loanAccountNumber = null;
      target.tv_inArrears = null;
      target.tv_amountDue = null;
      target.tv_repaymentDate = null;
      target.et_amount = null;
      target.et_additionalPayment = null;
      target.et_fees = null;
      target.tv_total = null;
      target.sp_paymentType = null;
      view2131558832.setOnClickListener(null);
      target.bt_paynow = null;
      view2131558831.setOnClickListener(null);
    }
  }
}
