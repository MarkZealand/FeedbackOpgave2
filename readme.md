# GRUPPEMEDLEMMER
- Mark

# HVAD PROGRAMMET GØR
Programmet anmoder om en række input fra brugeren, og behandler derefter disse input strings med if-else statements, for at finde frem til en række forskellige scenarier angående status på trafiklyset.
# VORES REGLER
Der er lagt en vigtig førsteprioritet ind, i form af nødsituation der altid skal eksekveres som den første hvis sand. Udover dette, kan programmet skelne mellem dag, nat eller aften, såvel som områdetype & trafikmængde.
# VORES UDVIDELSE
Fodgængerovergang, med en knap der aktiverer grønt lys for fodgængere, hvis visse betingelser er opfyldt. Fordi dette er en forholdsvis vigtig regel, ligger den højt oppe i if-else sekvensen, for at sikre at den bliver eksekveret hvis betingelserne er opfyldt.
# TEST

# NOGET DER VAR SVÆRT

# NOGET VI ØNSKER FEEDBACK PÅ
I "Trin 6" delen for eksempel, tænker jeg på om det er best practice at initialisere en tom String:
> String adgangTilladt = "";

eller om det som standard giver mere mening at fylde default data ud i stringen når man først opretter den som variabel. I Trin 6, ville det så være 

> String adgangTilladt = "FORBUDT";

