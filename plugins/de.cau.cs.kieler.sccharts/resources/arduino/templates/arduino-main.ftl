<#include "/templates/injection.ftl">
<@inject position="header" />
#include "${tickdata_file}"

TickData ${tickdata_name};
<@inject position="global-decl" />
<@inject position="body" />

void setup() {
    <@inject position="init" /><#nt>
    reset(&${tickdata_name});
}

void loop() {
    <@inject position="local-decl" />
    <@inject position="start-loop" /><#nt>
    <@inject position="input" /><#nt>
    <@inject position="pre-tick" /><#nt>
    tick(&${tickdata_name});
    <@inject position="post-tick" /><#nt>
    <@inject position="output" /><#nt>
    <@inject position="end-loop" /><#nt>
}
