// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.login;

import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class LoginActivity$$ViewBinder<T extends LoginActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558542, "field 'et_domain'");
    target.et_domain = finder.castView(view, 2131558542, "field 'et_domain'");
    view = finder.findRequiredView(source, 2131558536, "field 'et_username'");
    target.et_username = finder.castView(view, 2131558536, "field 'et_username'");
    view = finder.findRequiredView(source, 2131558523, "field 'et_password' and method 'passwordSubmitted'");
    target.et_password = finder.castView(view, 2131558523, "field 'et_password'");
    unbinder.view2131558523 = view;
    ((TextView) view).setOnEditorActionListener(new TextView.OnEditorActionListener() {
      @Override
      public boolean onEditorAction(TextView p0, int p1, KeyEvent p2) {
        return target.passwordSubmitted(p2);
      }
    });
    view = finder.findRequiredView(source, 2131558546, "field 'tv_full_url'");
    target.tv_full_url = finder.castView(view, 2131558546, "field 'tv_full_url'");
    view = finder.findRequiredView(source, 2131558539, "field 'bt_connectionSettings'");
    target.bt_connectionSettings = finder.castView(view, 2131558539, "field 'bt_connectionSettings'");
    view = finder.findRequiredView(source, 2131558545, "field 'et_tenantIdentifier'");
    target.et_tenantIdentifier = finder.castView(view, 2131558545, "field 'et_tenantIdentifier'");
    view = finder.findRequiredView(source, 2131558543, "field 'et_port'");
    target.et_port = finder.castView(view, 2131558543, "field 'et_port'");
    view = finder.findRequiredView(source, 2131558540, "field 'll_connectionSettings'");
    target.ll_connectionSettings = finder.castView(view, 2131558540, "field 'll_connectionSettings'");
    view = finder.findRequiredView(source, 2131558538, "method 'onLoginClick'");
    unbinder.view2131558538 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onLoginClick(finder.<Button>castParam(p0, "doClick", 0, "onLoginClick", 0)
        );
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends LoginActivity> implements Unbinder {
    private T target;

    View view2131558523;

    View view2131558538;

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
      target.et_domain = null;
      target.et_username = null;
      ((TextView) view2131558523).setOnEditorActionListener(null);
      target.et_password = null;
      target.tv_full_url = null;
      target.bt_connectionSettings = null;
      target.et_tenantIdentifier = null;
      target.et_port = null;
      target.ll_connectionSettings = null;
      view2131558538.setOnClickListener(null);
    }
  }
}
