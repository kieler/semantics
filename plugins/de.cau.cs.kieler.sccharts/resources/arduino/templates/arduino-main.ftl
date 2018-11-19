<#include "/templates/injection.ftl">
<@inject position="header" />
#include "${tickdata_file}"

TickData ${tickdata_name};
<@inject position="body" />

void setup() {
    <@inject position="init" /><#nt>
    reset(&${tickdata_name});
}

void loop() {
    <@inject position="loopstart" /><#nt>
    <@inject position="input" /><#nt>
    <@inject position="tickstart" /><#nt>
    tick(&${tickdata_name});
    <@inject position="tickend" /><#nt>
    <@inject position="output" /><#nt>
    <@inject position="loopend" /><#nt>
    delay(500);
}
