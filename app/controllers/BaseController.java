package controllers;

import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;

import javax.inject.Inject;

class BaseController extends Controller {

    @Inject
    FormFactory formFactory;
}