// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.generatecollectionsheet;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class GenerateCollectionSheetFragment$$ViewBinder<T extends GenerateCollectionSheetFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558759, "field 'sp_offices'");
    target.sp_offices = finder.castView(view, 2131558759, "field 'sp_offices'");
    view = finder.findRequiredView(source, 2131558763, "field 'sp_loan_officers'");
    target.sp_loan_officers = finder.castView(view, 2131558763, "field 'sp_loan_officers'");
    view = finder.findRequiredView(source, 2131558765, "field 'sp_centers'");
    target.sp_centers = finder.castView(view, 2131558765, "field 'sp_centers'");
    view = finder.findRequiredView(source, 2131558767, "field 'sp_groups'");
    target.sp_groups = finder.castView(view, 2131558767, "field 'sp_groups'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends GenerateCollectionSheetFragment> implements Unbinder {
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
      target.sp_offices = null;
      target.sp_loan_officers = null;
      target.sp_centers = null;
      target.sp_groups = null;
    }
  }
}
