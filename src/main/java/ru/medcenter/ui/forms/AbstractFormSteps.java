package ru.medcenter.ui.forms;

import com.google.inject.Inject;
import lombok.Getter;

public abstract class AbstractFormSteps<T extends UIForm>  {
    @Getter
    @Inject
    protected T form;
}
