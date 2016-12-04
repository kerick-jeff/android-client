// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.grouploanaccount;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class GroupLoanAccountFragment$$ViewBinder<T extends GroupLoanAccountFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558635, "field 'spLoanProduct'");
    target.spLoanProduct = finder.castView(view, 2131558635, "field 'spLoanProduct'");
    view = finder.findRequiredView(source, 2131558637, "field 'spLoanPurpose'");
    target.spLoanPurpose = finder.castView(view, 2131558637, "field 'spLoanPurpose'");
    view = finder.findRequiredView(source, 2131558638, "field 'tvSubmittedonDate'");
    target.tvSubmittedonDate = finder.castView(view, 2131558638, "field 'tvSubmittedonDate'");
    view = finder.findRequiredView(source, 2131558640, "field 'etClientExternalId'");
    target.etClientExternalId = finder.castView(view, 2131558640, "field 'etClientExternalId'");
    view = finder.findRequiredView(source, 2131558641, "field 'etNominalAnnual'");
    target.etNominalAnnual = finder.castView(view, 2131558641, "field 'etNominalAnnual'");
    view = finder.findRequiredView(source, 2131558642, "field 'etPrincipal'");
    target.etPrincipal = finder.castView(view, 2131558642, "field 'etPrincipal'");
    view = finder.findRequiredView(source, 2131558643, "field 'etLoanterm'");
    target.etLoanterm = finder.castView(view, 2131558643, "field 'etLoanterm'");
    view = finder.findRequiredView(source, 2131558644, "field 'etNumberOfRepayments'");
    target.etNumberOfRepayments = finder.castView(view, 2131558644, "field 'etNumberOfRepayments'");
    view = finder.findRequiredView(source, 2131558645, "field 'etRepaidevery'");
    target.etRepaidevery = finder.castView(view, 2131558645, "field 'etRepaidevery'");
    view = finder.findRequiredView(source, 2131558646, "field 'spPaymentPeriods'");
    target.spPaymentPeriods = finder.castView(view, 2131558646, "field 'spPaymentPeriods'");
    view = finder.findRequiredView(source, 2131558648, "field 'etNominalInterestRate'");
    target.etNominalInterestRate = finder.castView(view, 2131558648, "field 'etNominalInterestRate'");
    view = finder.findRequiredView(source, 2131558650, "field 'spAmortization'");
    target.spAmortization = finder.castView(view, 2131558650, "field 'spAmortization'");
    view = finder.findRequiredView(source, 2131558652, "field 'spInterestCalculationPeriod'");
    target.spInterestCalculationPeriod = finder.castView(view, 2131558652, "field 'spInterestCalculationPeriod'");
    view = finder.findRequiredView(source, 2131558657, "field 'spFund'");
    target.spFund = finder.castView(view, 2131558657, "field 'spFund'");
    view = finder.findRequiredView(source, 2131558659, "field 'spLoanOfficer'");
    target.spLoanOfficer = finder.castView(view, 2131558659, "field 'spLoanOfficer'");
    view = finder.findRequiredView(source, 2131558661, "field 'spInterestType'");
    target.spInterestType = finder.castView(view, 2131558661, "field 'spInterestType'");
    view = finder.findRequiredView(source, 2131558654, "field 'spRepaymentStrategy'");
    target.spRepaymentStrategy = finder.castView(view, 2131558654, "field 'spRepaymentStrategy'");
    view = finder.findRequiredView(source, 2131558655, "field 'ckCalculateInterest'");
    target.ckCalculateInterest = finder.castView(view, 2131558655, "field 'ckCalculateInterest'");
    view = finder.findRequiredView(source, 2131558639, "field 'tvDisbursementonDate'");
    target.tvDisbursementonDate = finder.castView(view, 2131558639, "field 'tvDisbursementonDate'");
    view = finder.findRequiredView(source, 2131558662, "field 'btLoanSubmit'");
    target.btLoanSubmit = finder.castView(view, 2131558662, "field 'btLoanSubmit'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends GroupLoanAccountFragment> implements Unbinder {
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
      target.spLoanProduct = null;
      target.spLoanPurpose = null;
      target.tvSubmittedonDate = null;
      target.etClientExternalId = null;
      target.etNominalAnnual = null;
      target.etPrincipal = null;
      target.etLoanterm = null;
      target.etNumberOfRepayments = null;
      target.etRepaidevery = null;
      target.spPaymentPeriods = null;
      target.etNominalInterestRate = null;
      target.spAmortization = null;
      target.spInterestCalculationPeriod = null;
      target.spFund = null;
      target.spLoanOfficer = null;
      target.spInterestType = null;
      target.spRepaymentStrategy = null;
      target.ckCalculateInterest = null;
      target.tvDisbursementonDate = null;
      target.btLoanSubmit = null;
    }
  }
}
