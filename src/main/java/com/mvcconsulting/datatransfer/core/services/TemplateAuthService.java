package com.mvcconsulting.datatransfer.core.services;

import com.mvcconsulting.datatransfer.core.models.Token;
import org.codehaus.jettison.json.JSONException;

public interface TemplateAuthService {

    Token getAuth() ;
}
