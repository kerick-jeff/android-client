// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.dialogfragments.savingsaccountapproval;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SavingsAccountApproval$$ViewBinder<T extends SavingsAccountApproval> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558568, "field 'et_s_approval_date'");
    target.et_s_approval_date = finder.castView(view, 2131558568, "field 'et_s_approval_date'");
    view = finder.findRequiredView(source, 2131558570, "field 'bt_approve_savings'");
    target.bt_approve_savings = finder.castView(view, 2131558570, "field 'bt_approve_savings'");
    view = finder.findRequiredView(source, 2131558569, "field 'et_savings_approval_reason'");
    target.et_savings_approval_reason = finder.castView(view, 2131558569, "field 'et_savings_approval_reason'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SavingsAccountApproval> implements Unbinder {
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
      target.et_s_approval_date = null;
      target.bt_approve_savings = null;
      target.et_savings_approval_reason = null;
    }
  }
}
