// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.loanaccountsummary;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class LoanAccountSummaryFragment$$ViewBinder<T extends LoanAccountSummaryFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558788, "field 'view_status_indicator'");
    target.view_status_indicator = view;
    view = finder.findRequiredView(source, 2131558784, "field 'tv_clientName'");
    target.tv_clientName = finder.castView(view, 2131558784, "field 'tv_clientName'");
    view = finder.findRequiredView(source, 2131558785, "field 'quickContactBadge'");
    target.quickContactBadge = finder.castView(view, 2131558785, "field 'quickContactBadge'");
    view = finder.findRequiredView(source, 2131558789, "field 'tv_loan_product_short_name'");
    target.tv_loan_product_short_name = finder.castView(view, 2131558789, "field 'tv_loan_product_short_name'");
    view = finder.findRequiredView(source, 2131558790, "field 'tv_loanAccountNumber'");
    target.tv_loanAccountNumber = finder.castView(view, 2131558790, "field 'tv_loanAccountNumber'");
    view = finder.findRequiredView(source, 2131558793, "field 'tv_amount_disbursed'");
    target.tv_amount_disbursed = finder.castView(view, 2131558793, "field 'tv_amount_disbursed'");
    view = finder.findRequiredView(source, 2131558795, "field 'tv_disbursement_date'");
    target.tv_disbursement_date = finder.castView(view, 2131558795, "field 'tv_disbursement_date'");
    view = finder.findRequiredView(source, 2131558797, "field 'tv_in_arrears'");
    target.tv_in_arrears = finder.castView(view, 2131558797, "field 'tv_in_arrears'");
    view = finder.findRequiredView(source, 2131558658, "field 'tv_loan_officer'");
    target.tv_loan_officer = finder.castView(view, 2131558658, "field 'tv_loan_officer'");
    view = finder.findRequiredView(source, 2131558802, "field 'tv_principal'");
    target.tv_principal = finder.castView(view, 2131558802, "field 'tv_principal'");
    view = finder.findRequiredView(source, 2131558804, "field 'tv_loan_principal_due'");
    target.tv_loan_principal_due = finder.castView(view, 2131558804, "field 'tv_loan_principal_due'");
    view = finder.findRequiredView(source, 2131558803, "field 'tv_loan_principal_paid'");
    target.tv_loan_principal_paid = finder.castView(view, 2131558803, "field 'tv_loan_principal_paid'");
    view = finder.findRequiredView(source, 2131558806, "field 'tv_interest'");
    target.tv_interest = finder.castView(view, 2131558806, "field 'tv_interest'");
    view = finder.findRequiredView(source, 2131558808, "field 'tv_loan_interest_due'");
    target.tv_loan_interest_due = finder.castView(view, 2131558808, "field 'tv_loan_interest_due'");
    view = finder.findRequiredView(source, 2131558807, "field 'tv_loan_interest_paid'");
    target.tv_loan_interest_paid = finder.castView(view, 2131558807, "field 'tv_loan_interest_paid'");
    view = finder.findRequiredView(source, 2131558810, "field 'tv_fees'");
    target.tv_fees = finder.castView(view, 2131558810, "field 'tv_fees'");
    view = finder.findRequiredView(source, 2131558812, "field 'tv_loan_fees_due'");
    target.tv_loan_fees_due = finder.castView(view, 2131558812, "field 'tv_loan_fees_due'");
    view = finder.findRequiredView(source, 2131558811, "field 'tv_loan_fees_paid'");
    target.tv_loan_fees_paid = finder.castView(view, 2131558811, "field 'tv_loan_fees_paid'");
    view = finder.findRequiredView(source, 2131558814, "field 'tv_penalty'");
    target.tv_penalty = finder.castView(view, 2131558814, "field 'tv_penalty'");
    view = finder.findRequiredView(source, 2131558816, "field 'tv_loan_penalty_due'");
    target.tv_loan_penalty_due = finder.castView(view, 2131558816, "field 'tv_loan_penalty_due'");
    view = finder.findRequiredView(source, 2131558815, "field 'tv_loan_penalty_paid'");
    target.tv_loan_penalty_paid = finder.castView(view, 2131558815, "field 'tv_loan_penalty_paid'");
    view = finder.findRequiredView(source, 2131558818, "field 'tv_total'");
    target.tv_total = finder.castView(view, 2131558818, "field 'tv_total'");
    view = finder.findRequiredView(source, 2131558820, "field 'tv_total_due'");
    target.tv_total_due = finder.castView(view, 2131558820, "field 'tv_total_due'");
    view = finder.findRequiredView(source, 2131558819, "field 'tv_total_paid'");
    target.tv_total_paid = finder.castView(view, 2131558819, "field 'tv_total_paid'");
    view = finder.findRequiredView(source, 2131558821, "field 'bt_processLoanTransaction' and method 'onProcessTransactionClicked'");
    target.bt_processLoanTransaction = finder.castView(view, 2131558821, "field 'bt_processLoanTransaction'");
    unbinder.view2131558821 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onProcessTransactionClicked();
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends LoanAccountSummaryFragment> implements Unbinder {
    private T target;

    View view2131558821;

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
      target.view_status_indicator = null;
      target.tv_clientName = null;
      target.quickContactBadge = null;
      target.tv_loan_product_short_name = null;
      target.tv_loanAccountNumber = null;
      target.tv_amount_disbursed = null;
      target.tv_disbursement_date = null;
      target.tv_in_arrears = null;
      target.tv_loan_officer = null;
      target.tv_principal = null;
      target.tv_loan_principal_due = null;
      target.tv_loan_principal_paid = null;
      target.tv_interest = null;
      target.tv_loan_interest_due = null;
      target.tv_loan_interest_paid = null;
      target.tv_fees = null;
      target.tv_loan_fees_due = null;
      target.tv_loan_fees_paid = null;
      target.tv_penalty = null;
      target.tv_loan_penalty_due = null;
      target.tv_loan_penalty_paid = null;
      target.tv_total = null;
      target.tv_total_due = null;
      target.tv_total_paid = null;
      view2131558821.setOnClickListener(null);
      target.bt_processLoanTransaction = null;
    }
  }
}
