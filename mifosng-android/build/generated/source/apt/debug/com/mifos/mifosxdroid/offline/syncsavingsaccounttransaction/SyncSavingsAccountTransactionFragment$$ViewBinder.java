// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.offline.syncsavingsaccounttransaction;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SyncSavingsAccountTransactionFragment$$ViewBinder<T extends SyncSavingsAccountTransactionFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558881, "field 'rv_loan_repayment'");
    target.rv_loan_repayment = finder.castView(view, 2131558881, "field 'rv_loan_repayment'");
    view = finder.findRequiredView(source, 2131558678, "field 'swipeRefreshLayout'");
    target.swipeRefreshLayout = finder.castView(view, 2131558678, "field 'swipeRefreshLayout'");
    view = finder.findRequiredView(source, 2131558846, "field 'mNoPayloadText'");
    target.mNoPayloadText = finder.castView(view, 2131558846, "field 'mNoPayloadText'");
    view = finder.findRequiredView(source, 2131558845, "field 'mNoPayloadIcon' and method 'reloadOnError'");
    target.mNoPayloadIcon = finder.castView(view, 2131558845, "field 'mNoPayloadIcon'");
    unbinder.view2131558845 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.reloadOnError();
      }
    });
    view = finder.findRequiredView(source, 2131558681, "field 'll_error'");
    target.ll_error = finder.castView(view, 2131558681, "field 'll_error'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SyncSavingsAccountTransactionFragment> implements Unbinder {
    private T target;

    View view2131558845;

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
      target.rv_loan_repayment = null;
      target.swipeRefreshLayout = null;
      target.mNoPayloadText = null;
      view2131558845.setOnClickListener(null);
      target.mNoPayloadIcon = null;
      target.ll_error = null;
    }
  }
}
