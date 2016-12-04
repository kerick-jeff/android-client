// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.savingsaccount;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SavingsAccountFragment$$ViewBinder<T extends SavingsAccountFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558664, "field 'sp_product'");
    target.sp_product = finder.castView(view, 2131558664, "field 'sp_product'");
    view = finder.findRequiredView(source, 2131558640, "field 'et_client_external_id'");
    target.et_client_external_id = finder.castView(view, 2131558640, "field 'et_client_external_id'");
    view = finder.findRequiredView(source, 2131558638, "field 'tv_submission_date'");
    target.tv_submission_date = finder.castView(view, 2131558638, "field 'tv_submission_date'");
    view = finder.findRequiredView(source, 2131558641, "field 'et_nominal_annual'");
    target.et_nominal_annual = finder.castView(view, 2131558641, "field 'et_nominal_annual'");
    view = finder.findRequiredView(source, 2131558667, "field 'sp_interest_calc'");
    target.sp_interest_calc = finder.castView(view, 2131558667, "field 'sp_interest_calc'");
    view = finder.findRequiredView(source, 2131558669, "field 'sp_interest_comp'");
    target.sp_interest_comp = finder.castView(view, 2131558669, "field 'sp_interest_comp'");
    view = finder.findRequiredView(source, 2131558671, "field 'sp_interest_p_period'");
    target.sp_interest_p_period = finder.castView(view, 2131558671, "field 'sp_interest_p_period'");
    view = finder.findRequiredView(source, 2131558673, "field 'sp_days_in_year'");
    target.sp_days_in_year = finder.castView(view, 2131558673, "field 'sp_days_in_year'");
    view = finder.findRequiredView(source, 2131558674, "field 'bt_submit' and method 'submitSavingsAccount'");
    target.bt_submit = finder.castView(view, 2131558674, "field 'bt_submit'");
    unbinder.view2131558674 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.submitSavingsAccount();
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SavingsAccountFragment> implements Unbinder {
    private T target;

    View view2131558674;

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
      target.sp_product = null;
      target.et_client_external_id = null;
      target.tv_submission_date = null;
      target.et_nominal_annual = null;
      target.sp_interest_calc = null;
      target.sp_interest_comp = null;
      target.sp_interest_p_period = null;
      target.sp_days_in_year = null;
      view2131558674.setOnClickListener(null);
      target.bt_submit = null;
    }
  }
}
