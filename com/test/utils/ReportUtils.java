package com.test.utils;

import gherkin.deps.com.google.gson.Gson;

import java.util.List;

public class ReportUtils {

    private static Gson gson = new Gson();

    private ReportUtils() {
    }

    static StringBuilder formatStepName(String step) {
        StringBuilder builder = new StringBuilder();

        builder.append("<b>");
        builder.append(step);
        builder.append("</b><br>");
        return builder;
    }

    /*
     * Formata lista em uma string para melhor visualização de seus respectivos valores.
     *
     * @param <T>
     *            the generic type
     * @param lista
     *            a lista de objetos
     * @return string formatada
     */
    public static <T> String formataLista(List<T> list) {
        String className = null;
        if (list != null && !list.isEmpty()) {
            className = list.get(0).getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<b>:: Lista de " + className + "s ::</b><br>");

        for (T item : list) {
            sb.append("<br><br><b>[" + className + "]:</b> ");
            sb.append(item);
        }
        return sb.toString();
    }

    /*
     * Formata lista em uma string para melhor visualização de seus respectivos valores.
     *
     * @param <T>
     *            the generic type
     * @param lista
     *            a lista de objetos
     * @param texto
     *            o texto a ser exibido no titulo
     * @return string formatada
     */
    public static <T> String formataLista(List<T> list, String texto) {
        String className = null;
        if (list != null && !list.isEmpty()) {
            className = list.get(0).getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<b>:: " + texto + " ::</b><br>");

        for (T item : list) {
            sb.append("<br><br><b>[" + className + "]:</b> ");
            sb.append(item);
        }
        return sb.toString();
    }

    public static void report(String step, StringBuilder message) {
        StringBuilder builder = formatStepName(step);
        builder.append(message);
        //ExtentCucumberFormatter.setStepDetailsMessage(builder.toString());
    }

    public static void report(String step, Object obj) {
        StringBuilder builder = formatStepName(step);
        builder.append(gson.toJson(obj));
        //ExtentCucumberFormatter.setStepDetailsMessage(builder.toString());
    }

    public static <T> void report(final String step, final List<T> list) {
        final StringBuilder builder = formatStepName(step);
        list.forEach(l -> {
            builder.append("<br><br><b> " + list.get(0).getClass().getSimpleName() + ": </b>");
            builder.append(gson.toJson(l));
        });
        //ExtentCucumberFormatter.setStepDetailsMessage(builder.toString());
    }
}
