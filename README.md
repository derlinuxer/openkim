# OpenKIM

Implementieren eines KIM-Client-Moduls laut Spezifikation:
https://fachportal.gematik.de/fachportal-import/files/gemSpec_CM_KOMLE_V1.14.0.pdf

> Die Zulassung der Gematik ist noch nicht erfolgt!! OpenKIM darf deshalb nicht als KIM-Clientmodul betrieben werden.

## aktuelle Einsatzgebiete von OpenKIM
Viele setzen OpenKIM als Monitoring-Werkzeug ein, um z.b. zu checken, 
ob der TI-Konnektor mit der TI verbunden ist. Weitere Monitoring- und Diagnosemöglichkeiten sind
implementiert (Kartenhandling etc.)

Wir möchten OpenKIM in bestehende Testpipelines integrieren. Entsprechende Unit-Tests, die alle Anforderungen 
der Spezifikation abdecken, sollen entwickelt werden. Ausserdem eine entsprechende API, um z.b. 
mit Postman (https://www.postman.com/) in bestehende CI/CD-Pipelines zu integrieren.

Eine Plugin-Schnittstelle wird entwickelt, um euch die Möglichkeit zu geben, Closed-Source / Open-Source Plugins
zu implementieren.

## OpenKIM starten

> ### [OpenKIM QuickStart Guide](doc/QuickStartGuide.md)

# Wöchentliche Community Runde

Wenn ihr Lust habt mitzumachen oder euch einfach zu informieren:
Jeden Freitag um 13 Uhr bieten wir ein zoom-Meeting an.

https://us06web.zoom.us/j/82998471898?pwd=WlVwN3Z1NXBaNTFxSGdHMW96aThvUT09


# Roadmap
1. KIM-CM-Spezi: Integration der KAS-API-Calls
1. KIM-CM-Spezi: Integration der ACCMGR-API-Calls
1. Testpipeline: Unit-Tests
1. CI/CD-Pipeline: API für die Tests

Viel Spaß euch mit OpenKIM