Postup pro spuštění backendové části aplikace, databáze PostgreSQL v dockeru, zpřístupnění BE pomocí služby NGROK a zprovoznění v rámci moblní aplikace:
## 1. Spuštění databáze pomocí Dockeru

1. Ujistěte se, že je **Docker** nainstalovaný a spuštěný.
2. Otevřete **příkazový řádek (CMD)**.
3. Spusťte databázi PostgreSQL následujícím příkazem:

```bash
docker run --rm --name postgres -p 5433:5432 -e POSTGRES_PASSWORD=123 postgres
```

**Popis:**

* Databáze běží na portu **5433**.
* Heslo databáze je nastaveno na `123`.
* Kontejner se po ukončení automaticky odstraní (`--rm`).

---

## 2. Spuštění backendové aplikace

1. Otevřete backendový projekt v **IntelliJ IDEA**.
2. Zkontrolujte nastavení JDK:

   * `File → Settings → Build, Execution & Deployment → Gradle`
   * Gradle JVM nastavte na **corretto-17**
3. Zkontrolujte projektové SDK:

   * `File → Project Structure → Project`
   * SDK: **corretto-17**
   * Language level: **17**
4. Spusťte backendovou aplikaci standardním způsobem v IntelliJ IDEA.

Backend se po spuštění lokálně spouští na portu **8090**.

---

## 3. Zpřístupnění backendu pomocí ngrok

1. Zaregistujte se na ngrok.com a nainstalujte si pomocí návodu nástroj pro zpřístupnění BE do veřejné sítě.

Pro komunikaci mobilní aplikace s backendem je nutné backend zpřístupnit z veřejné sítě.
1. Otevřete **CMD**.
2. Přejděte do adresáře, kde je nainstalovaný **ngrok**:

```bash
cd YOUR_PATH_TO_NGROK\ngrok-v3-stable-windows-amd64
```

3. Spusťte ngrok příkazem:

```bash
ngrok http 8090 --request-header-add "ngrok-skip-browser-warning: 1"
```

4. Po spuštění se zobrazí výpis podobný následujícímu:

```
Session Status    online
Region            Europe (eu)
Web Interface     http://127.0.0.1:4040
Forwarding        https://55aa-94-113-102-25.ngrok-free.app -> http://localhost:8090
```

5. Backend je nyní dostupný na adrese uvedené u položky **Forwarding**.

---

## 4. Nastavení URL v mobilní aplikaci

1. Otevřete projekt mobilní aplikace.
2. Vyhledejte místo označené klíčovým slovem:

```
TODO NGROK URL
```

3. Nahraďte zde původní adresu nově vygenerovanou **ngrok URL** (hodnota `Forwarding`).
4. Spusťte mobilní aplikaci.
