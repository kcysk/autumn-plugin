package com.keshen.autumnplugin;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

/**
 * @author momo
 * @since 2022/9/5 23:36
 */
public class TabFactory implements ToolWindowFactory {

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        AutumnAbilityBar viewPanel = new AutumnAbilityBar(project);
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(viewPanel, "领域能力", false);
        toolWindow.getContentManager().addContent(content, 0);
    }
}
