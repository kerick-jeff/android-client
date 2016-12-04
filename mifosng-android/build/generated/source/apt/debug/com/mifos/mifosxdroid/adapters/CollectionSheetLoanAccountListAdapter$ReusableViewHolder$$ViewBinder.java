// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.adapters;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class CollectionSheetLoanAccountListAdapter$ReusableViewHolder$$ViewBinder<T extends CollectionSheetLoanAccountListAdapter.ReusableViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558981, "field 'tv_loanShortName'");
    target.tv_loanShortName = finder.castView(view, 2131558981, "field 'tv_loanShortName'");
    view = finder.findRequiredView(source, 2131558982, "field 'tv_amountDue'");
    target.tv_amountDue = finder.castView(view, 2131558982, "field 'tv_amountDue'");
    view = finder.findRequiredView(source, 2131558983, "field 'et_amountPaid'");
    target.et_amountPaid = finder.castView(view, 2131558983, "field 'et_amountPaid'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends CollectionSheetLoanAccountListAdapter.ReusableViewHolder> implements Unbinder {
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
      target.tv_loanShortName = null;
      target.tv_amountDue = null;
      target.et_amountPaid = null;
    }
  }
}
