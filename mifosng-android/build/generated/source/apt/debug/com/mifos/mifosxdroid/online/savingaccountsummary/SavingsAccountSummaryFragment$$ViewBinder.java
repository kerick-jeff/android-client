// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.savingaccountsummary;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SavingsAccountSummaryFragment$$ViewBinder<T extends SavingsAccountSummaryFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558784, "field 'tv_clientName'");
    target.tv_clientName = finder.castView(view, 2131558784, "field 'tv_clientName'");
    view = finder.findRequiredView(source, 2131558785, "field 'quickContactBadge'");
    target.quickContactBadge = finder.castView(view, 2131558785, "field 'quickContactBadge'");
    view = finder.findRequiredView(source, 2131558847, "field 'tv_savingsProductName'");
    target.tv_savingsProductName = finder.castView(view, 2131558847, "field 'tv_savingsProductName'");
    view = finder.findRequiredView(source, 2131558848, "field 'tv_savingsAccountNumber'");
    target.tv_savingsAccountNumber = finder.castView(view, 2131558848, "field 'tv_savingsAccountNumber'");
    view = finder.findRequiredView(source, 2131558850, "field 'tv_savingsAccountBalance'");
    target.tv_savingsAccountBalance = finder.castView(view, 2131558850, "field 'tv_savingsAccountBalance'");
    view = finder.findRequiredView(source, 2131558852, "field 'tv_totalDeposits'");
    target.tv_totalDeposits = finder.castView(view, 2131558852, "field 'tv_totalDeposits'");
    view = finder.findRequiredView(source, 2131558854, "field 'tv_totalWithdrawals'");
    target.tv_totalWithdrawals = finder.castView(view, 2131558854, "field 'tv_totalWithdrawals'");
    view = finder.findRequiredView(source, 2131558859, "field 'lv_Transactions'");
    target.lv_Transactions = finder.castView(view, 2131558859, "field 'lv_Transactions'");
    view = finder.findRequiredView(source, 2131558856, "field 'tv_interestEarned'");
    target.tv_interestEarned = finder.castView(view, 2131558856, "field 'tv_interestEarned'");
    view = finder.findRequiredView(source, 2131558862, "field 'bt_deposit' and method 'onDepositButtonClicked'");
    target.bt_deposit = finder.castView(view, 2131558862, "field 'bt_deposit'");
    unbinder.view2131558862 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onDepositButtonClicked();
      }
    });
    view = finder.findRequiredView(source, 2131558861, "field 'bt_withdrawal' and method 'onWithdrawalButtonClicked'");
    target.bt_withdrawal = finder.castView(view, 2131558861, "field 'bt_withdrawal'");
    unbinder.view2131558861 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onWithdrawalButtonClicked();
      }
    });
    view = finder.findRequiredView(source, 2131558863, "field 'bt_approve_saving' and method 'onProcessTransactionClicked'");
    target.bt_approve_saving = finder.castView(view, 2131558863, "field 'bt_approve_saving'");
    unbinder.view2131558863 = view;
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

  protected static class InnerUnbinder<T extends SavingsAccountSummaryFragment> implements Unbinder {
    private T target;

    View view2131558862;

    View view2131558861;

    View view2131558863;

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
      target.tv_clientName = null;
      target.quickContactBadge = null;
      target.tv_savingsProductName = null;
      target.tv_savingsAccountNumber = null;
      target.tv_savingsAccountBalance = null;
      target.tv_totalDeposits = null;
      target.tv_totalWithdrawals = null;
      target.lv_Transactions = null;
      target.tv_interestEarned = null;
      view2131558862.setOnClickListener(null);
      target.bt_deposit = null;
      view2131558861.setOnClickListener(null);
      target.bt_withdrawal = null;
      view2131558863.setOnClickListener(null);
      target.bt_approve_saving = null;
    }
  }
}
