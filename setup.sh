oc project nexusignite

oc new-project nexusignite
oc new-app sonatype/nexus
oc expose svc/nexus
oc get routes

# http://nexus-nexusignite.xxx/nexus/#welcome

oc new-project fuseignite

oc project fuseignite
oc create -f https://raw.githubusercontent.com/jboss-openshift/application-templates/master/amq/amq63-basic.json
oc import-image amq63-openshift --from=registry.access.redhat.com/jboss-amq-6/amq63-openshift --confirm
oc new-app --template=amq63-basic --param=MQ_USERNAME=admin --param=MQ_PASSWORD=admin --param=IMAGE_STREAM_NAMESPACE=fuseignite


oc delete svc/broker-amq-amqp
oc delete svc/broker-amq-mqtt
oc delete svc/broker-amq-stomp
oc delete svc/broker-amq-mesh


oc create -f https://raw.githubusercontent.com/syndesisio/syndesis/master/install/support/serviceaccount-as-oauthclient-restricted.yml
oc create -f https://raw.githubusercontent.com/syndesisio/syndesis/master/install/syndesis.yml

oc new-app syndesis \
    -p ROUTE_HOSTNAME=syndesis.52.230.124.252.nip.io \
    -p OPENSHIFT_MASTER=$(oc whoami --show-server) \
    -p OPENSHIFT_PROJECT=$(oc project -q) \
    -p OPENSHIFT_OAUTH_CLIENT_SECRET=$(oc sa get-token syndesis-oauth-client)


"**Job Applied For:**"+  +"**Job Location:**"+ Singapore +"**Expected Salary ($):**"+ 11000 +"**Resume:**"+ 10 years experience in BRMS and BPM in APAC.