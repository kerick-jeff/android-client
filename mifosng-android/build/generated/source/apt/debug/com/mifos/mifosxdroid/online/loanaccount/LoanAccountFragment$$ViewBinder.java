// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.loanaccount;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class LoanAccountFragment$$ViewBinder<T extends LoanAccountFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558635, "field 'sp_loan_product'");
    target.sp_loan_product = finder.castView(view, 2131558635, "field 'sp_loan_product'");
    view = finder.findRequiredView(source, 2131558637, "field 'sp_loan_purpose'");
    target.sp_loan_purpose = finder.castView(view, 2131558637, "field 'sp_loan_purpose'");
    view = finder.findRequiredView(source, 2131558638, "field 'tv_submittedon_date'");
    target.tv_submittedon_date = finder.castView(view, 2131558638, "field 'tv_submittedon_date'");
    view = finder.findRequiredView(source, 2131558640, "field 'et_client_external_id'");
    target.et_client_external_id = finder.castView(view, 2131558640, "field 'et_client_external_id'");
    view = finder.findRequiredView(source, 2131558641, "field 'et_nominal_annual'");
    target.et_nominal_annual = finder.castView(view, 2131558641, "field 'et_nominal_annual'");
    view = finder.findRequiredView(source, 2131558642, "field 'et_principal'");
    target.et_principal = finder.castView(view, 2131558642, "field 'et_principal'");
    view = finder.findRequiredView(source, 2131558643, "field 'et_loanterm'");
    target.et_loanterm = finder.castView(view, 2131558643, "field 'et_loanterm'");
    view = finder.findRequiredView(source, 2131558644, "field 'et_numberofrepayments'");
    target.et_numberofrepayments = finder.castView(view, 2131558644, "field 'et_numberofrepayments'");
    view = finder.findRequiredView(source, 2131558645, "field 'et_repaidevery'");
    target.et_repaidevery = finder.castView(view, 2131558645, "field 'et_repaidevery'");
    view = finder.findRequiredView(source, 2131558646, "field 'sp_payment_periods'");
    target.sp_payment_periods = finder.castView(view, 2131558646, "field 'sp_payment_periods'");
    view = finder.findRequiredView(source, 2131558648, "field 'et_nominal_interest_rate'");
    target.et_nominal_interest_rate = finder.castView(view, 2131558648, "field 'et_nominal_interest_rate'");
    view = finder.findRequiredView(source, 2131558650, "field 'sp_amortization'");
    target.sp_amortization = finder.castView(view, 2131558650, "field 'sp_amortization'");
    view = finder.findRequiredView(source, 2131558652, "field 'sp_interestcalculationperiod'");
    target.sp_interestcalculationperiod = finder.castView(view, 2131558652, "field 'sp_interestcalculationperiod'");
    view = finder.findRequiredView(source, 2131558654, "field 'sp_repaymentstrategy'");
    target.sp_repaymentstrategy = finder.castView(view, 2131558654, "field 'sp_repaymentstrategy'");
    view = finder.findRequiredView(source, 2131558661, "field 'sp_interest_type'");
    target.sp_interest_type = finder.castView(view, 2131558661, "field 'sp_interest_type'");
    view = finder.findRequiredView(source, 2131558659, "field 'sp_loan_officer'");
    target.sp_loan_officer = finder.castView(view, 2131558659, "field 'sp_loan_officer'");
    view = finder.findRequiredView(source, 2131558657, "field 'sp_fund'");
    target.sp_fund = finder.castView(view, 2131558657, "field 'sp_fund'");
    view = finder.findRequiredView(source, 2131558655, "field 'ck_calculateinterest'");
    target.ck_calculateinterest = finder.castView(view, 2131558655, "field 'ck_calculateinterest'");
    view = finder.findRequiredView(source, 2131558639, "field 'tv_disbursementon_date'");
    target.tv_disbursementon_date = finder.castView(view, 2131558639, "field 'tv_disbursementon_date'");
    view = finder.findRequiredView(source, 2131558662, "field 'bt_loan_submit'");
    target.bt_loan_submit = finder.castView(view, 2131558662, "field 'bt_loan_submit'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends LoanAccountFragment> implements Unbinder {
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
      target.sp_loan_product = null;
      target.sp_loan_purpose = null;
      target.tv_submittedon_date = null;
      target.et_client_external_id = null;
      target.et_nominal_annual = null;
      target.et_principal = null;
      target.et_loanterm = null;
      target.et_numberofrepayments = null;
      target.et_repaidevery = null;
      target.sp_payment_periods = null;
      target.et_nominal_interest_rate = null;
      target.sp_amortization = null;
      target.sp_interestcalculationperiod = null;
      target.sp_repaymentstrategy = null;
      target.sp_interest_type = null;
      target.sp_loan_officer = null;
      target.sp_fund = null;
      target.ck_calculateinterest = null;
      target.tv_disbursementon_date = null;
      target.bt_loan_submit = null;
    }
  }
}
