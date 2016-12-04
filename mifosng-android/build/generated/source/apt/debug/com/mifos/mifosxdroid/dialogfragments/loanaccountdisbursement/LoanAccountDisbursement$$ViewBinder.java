// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.dialogfragments.loanaccountdisbursement;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class LoanAccountDisbursement$$ViewBinder<T extends LoanAccountDisbursement> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558588, "field 'loan_disbursement_dates'");
    target.loan_disbursement_dates = finder.castView(view, 2131558588, "field 'loan_disbursement_dates'");
    view = finder.findRequiredView(source, 2131558593, "field 'bt_disburse_loan'");
    target.bt_disburse_loan = finder.castView(view, 2131558593, "field 'bt_disburse_loan'");
    view = finder.findRequiredView(source, 2131558591, "field 'sp_payment_type'");
    target.sp_payment_type = finder.castView(view, 2131558591, "field 'sp_payment_type'");
    view = finder.findRequiredView(source, 2131558589, "field 'et_disbursed_amount'");
    target.et_disbursed_amount = finder.castView(view, 2131558589, "field 'et_disbursed_amount'");
    view = finder.findRequiredView(source, 2131558592, "field 'et_disbursement_note'");
    target.et_disbursement_note = finder.castView(view, 2131558592, "field 'et_disbursement_note'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends LoanAccountDisbursement> implements Unbinder {
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
      target.loan_disbursement_dates = null;
      target.bt_disburse_loan = null;
      target.sp_payment_type = null;
      target.et_disbursed_amount = null;
      target.et_disbursement_note = null;
    }
  }
}
