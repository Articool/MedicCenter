package ru.medcenter.ui.steps;

import com.google.inject.Inject;
import lombok.Getter;
import ru.medcenter.ui.forms.UIForm;

public abstract class AbstractFormSteps<T extends UIForm>  {
    @Getter
    @Inject
    protected T form;
}

