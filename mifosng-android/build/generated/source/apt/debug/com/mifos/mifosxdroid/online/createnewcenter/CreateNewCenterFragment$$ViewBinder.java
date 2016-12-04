// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.createnewcenter;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class CreateNewCenterFragment$$ViewBinder<T extends CreateNewCenterFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558724, "field 'et_centerName'");
    target.et_centerName = finder.castView(view, 2131558724, "field 'et_centerName'");
    view = finder.findRequiredView(source, 2131558726, "field 'cb_centerActiveStatus'");
    target.cb_centerActiveStatus = finder.castView(view, 2131558726, "field 'cb_centerActiveStatus'");
    view = finder.findRequiredView(source, 2131558727, "field 'tv_activationDate'");
    target.tv_activationDate = finder.castView(view, 2131558727, "field 'tv_activationDate'");
    view = finder.findRequiredView(source, 2131558725, "field 'sp_offices'");
    target.sp_offices = finder.castView(view, 2131558725, "field 'sp_offices'");
    view = finder.findRequiredView(source, 2131558674, "field 'bt_submit'");
    target.bt_submit = finder.castView(view, 2131558674, "field 'bt_submit'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends CreateNewCenterFragment> implements Unbinder {
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
      target.et_centerName = null;
      target.cb_centerActiveStatus = null;
      target.tv_activationDate = null;
      target.sp_offices = null;
      target.bt_submit = null;
    }
  }
}
